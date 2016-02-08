package com.widgetcorp.components.content;


import com.citytechinc.aem.bedrock.core.components.AbstractComponent;
import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.cq.component.annotations.widgets.DateField;
import com.citytechinc.cq.component.annotations.widgets.RichTextEditor;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;


@Component(value="News Story", disableTargeting = true)
@Model(adaptables = {SlingHttpServletRequest.class, Resource.class})
public class NewsStory extends AbstractComponent {

    @Inject
    private String headLine;

    @Inject
    private String storyText;

    @Inject
    private String storyDate;


//    @PostConstruct
//    public void init(){
//
//        this.headLine = get("headline", StringUtils.EMPTY);
//        this.storyText = get("storyText", StringUtils.EMPTY);
//        this.storyDate = get("storyDate", StringUtils.EMPTY);
//
//    }

    @DialogField(fieldName = "headline", fieldLabel = "Headline")
    public String getHeadLine() {
        return headLine;
    }

    @DialogField(fieldName = "storyText", fieldLabel = "Story Text" )
    @RichTextEditor
    public String getStoryText() {
        return storyText;
    }

    @DialogField(fieldName = "storyDate", fieldLabel = "Story Date")
    @DateField
    public String getStoryDate() {
        return storyDate;
    }
}
