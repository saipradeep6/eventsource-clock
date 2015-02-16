
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""
    
    <h1>Server Sent Event clock</h1>
    
    <h1 id="clock"></h1>
    
    <p>
        Clock events are pushed from the Server using a Server Sent Event connection.
    </p>
    
    <script type="text/javascript" charset="utf-8">

       if (!!window.EventSource) """),format.raw/*13.34*/("""{"""),format.raw/*13.35*/("""
         var source = new EventSource(""""),_display_(Seq[Any](/*14.41*/routes/*14.47*/.Application.liveClock())),format.raw/*14.71*/("""");
         source.addEventListener('message', function(e) """),format.raw/*15.57*/("""{"""),format.raw/*15.58*/("""
            $('#clock').html(e.data.replace(/(\d)/g, '<span>$1</span>'))
         """),format.raw/*17.10*/("""}"""),format.raw/*17.11*/(""");
       """),format.raw/*18.8*/("""}"""),format.raw/*18.9*/(""" else """),format.raw/*18.15*/("""{"""),format.raw/*18.16*/("""
         $("#clock").html("Sorry. This browser doesn't seem to support Server sent event. Check <a href='http://html5test.com/compare/feature/communication-eventSource.html'>html5test</a> for browser compatibility."); 
       """),format.raw/*20.8*/("""}"""),format.raw/*20.9*/("""
    </script>    
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 16 19:34:49 IST 2015
                    SOURCE: D:/ProjectWork/play-2.2.6/samples/java/eventsource-clock/app/views/index.scala.html
                    HASH: 665113fd7b3bcb0541f086bafda25b64e8c79ffd
                    MATRIX: 864->1|875->5|913->7|1213->279|1242->280|1319->321|1334->327|1380->351|1468->411|1497->412|1608->495|1637->496|1674->506|1702->507|1736->513|1765->514|2019->741|2047->742
                    LINES: 29->1|29->1|29->1|41->13|41->13|42->14|42->14|42->14|43->15|43->15|45->17|45->17|46->18|46->18|46->18|46->18|48->20|48->20
                    -- GENERATED --
                */
            