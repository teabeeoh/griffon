package ${project_package};

import griffon.core.artifact.GriffonService;
import griffon.metadata.ArtifactProviderFor;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonService;

@javax.inject.Singleton
@ArtifactProviderFor(GriffonService.class)
public class ${project_class_name}Service extends AbstractGriffonService {

}