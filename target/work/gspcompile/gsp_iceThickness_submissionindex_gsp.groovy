import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_iceThickness_submissionindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/submission/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',205,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("site")],-1)
printHtmlPart(3)
invokeTag('require','r',205,['modules':("bootstrap")],-1)
printHtmlPart(3)
invokeTag('javascript','asset',205,['src':("geolocation.js")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',206,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('textField','g',222,['class':("tb1"),'name':("measurementfull"),'size':("4"),'value':("0")],-1)
printHtmlPart(6)
invokeTag('textField','g',223,['class':("tb1"),'name':("measurementdecimal"),'size':("4"),'value':("0")],-1)
printHtmlPart(7)
invokeTag('textField','g',239,['class':("tb1"),'name':("percentage"),'size':("4")],-1)
printHtmlPart(8)
})
invokeTag('captureBody','sitemesh',262,[:],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1428855251000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
