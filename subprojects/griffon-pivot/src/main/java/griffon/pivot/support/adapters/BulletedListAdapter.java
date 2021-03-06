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
package griffon.pivot.support.adapters;

import griffon.core.CallableWithArgs;

/**
 * @author Andres Almiray
 * @since 2.0.0
 */
public class BulletedListAdapter implements GriffonPivotAdapter, org.apache.pivot.wtk.text.BulletedListListener {
    private CallableWithArgs<Void> styleChanged;

    public CallableWithArgs<Void> getStyleChanged() {
        return this.styleChanged;
    }


    public void setStyleChanged(CallableWithArgs<Void> styleChanged) {
        this.styleChanged = styleChanged;
    }


    public void styleChanged(org.apache.pivot.wtk.text.BulletedList arg0, org.apache.pivot.wtk.text.BulletedList.Style arg1) {
        if (styleChanged != null) {
            styleChanged.call(arg0, arg1);
        }
    }

}
