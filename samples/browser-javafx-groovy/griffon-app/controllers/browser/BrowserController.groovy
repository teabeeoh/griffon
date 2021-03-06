/*
 * Copyright 2008-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package browser

import griffon.core.artifact.GriffonController
import griffon.metadata.ArtifactProviderFor
import griffon.transform.Threading

@Threading(Threading.Policy.SKIP)
@ArtifactProviderFor(GriffonController)
class BrowserController {
    def model
    def builder

    void back() {
        if (builder.browser.engine.history.entries.size() > 0) {
            builder.browser.engine.history.go(-1)
            builder.urlField.text = getUrlFromHistory()
        }
    }

    void forward() {
        if (builder.browser.engine.history.entries.size() > 0) {
            builder.browser.engine.history.go(1)
            builder.urlField.text = getUrlFromHistory()
        }
    }

    void reload() {
        builder.browser.engine.reload()
    }

    void openUrl() {
        String url = model.url
        if (url.indexOf('://') < 0) url = 'http://' + url
        if (builder.browser.engine.location == url) return
        builder.browser.engine.load(url)
    }

    private String getUrlFromHistory() {
        builder.browser.engine.history.entries[builder.browser.engine.history.currentIndex].url
    }
}
