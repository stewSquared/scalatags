
package scalatags
package jsdom
import acyclic.file
import org.scalajs.dom
import scalatags.generic.Util

trait Tags extends generic.Tags[dom.Element, dom.Element, dom.Node]{
  import util._

  // Root Element
  lazy val html = "html".tag[dom.html.Html]
  // Document Metadata
  lazy val head = "head".tag[dom.html.Head]
  lazy val base = "base".voidTag[dom.html.Base]
  lazy val link = "link".voidTag[dom.html.Link]
  lazy val meta = "meta".voidTag[dom.html.Meta]
  // Scripting
  lazy val script = "script".tag[dom.html.Script]
  // Sections
  lazy val body = "body".tag[dom.html.Body]
  lazy val h1 = "h1".tag[dom.html.Heading]
  lazy val h2 = "h2".tag[dom.html.Heading]
  lazy val h3 = "h3".tag[dom.html.Heading]
  lazy val h4 = "h4".tag[dom.html.Heading]
  lazy val h5 = "h5".tag[dom.html.Heading]
  lazy val h6 = "h6".tag[dom.html.Heading]
  lazy val header = "header".tag[dom.html.Element]
  lazy val footer = "footer".tag[dom.html.Element]
  // Grouping content
  lazy val p = "p".tag[dom.html.Paragraph]
  lazy val hr = "hr".voidTag[dom.html.HR]
  lazy val pre = "pre".tag[dom.html.Pre]
  lazy val blockquote = "blockquote".tag[dom.html.Quote]
  lazy val ol = "ol".tag[dom.html.OList]
  lazy val ul = "ul".tag[dom.html.UList]
  lazy val li = "li".tag[dom.html.LI]
  lazy val dl = "dl".tag[dom.html.DList]
  lazy val dt = "dt".tag[dom.html.DT]
  lazy val dd = "dd".tag[dom.html.DD]
  lazy val figure = "figure".tag[dom.html.Element]
  lazy val figcaption = "figcaption".tag[dom.html.Element]
  lazy val div = "div".tag[dom.html.Div]
  // Text-level semantics
  lazy val a = "a".tag[dom.html.Anchor]
  lazy val em = "em".tag[dom.html.Element]
  lazy val strong = "strong".tag[dom.html.Element]
  lazy val small = "small".tag[dom.html.Element]
  lazy val s = "s".tag[dom.html.Element]
  lazy val cite = "cite".tag[dom.html.Element]
  lazy val code = "code".tag[dom.html.Element]
  lazy val sub = "sub".tag[dom.html.Element]
  lazy val sup = "sup".tag[dom.html.Element]
  lazy val i = "i".tag[dom.html.Element]
  lazy val b = "b".tag[dom.html.Element]
  lazy val u = "u".tag[dom.html.Element]
  lazy val span = "span".tag[dom.html.Span]
  lazy val br = "br".voidTag[dom.html.BR]
  lazy val wbr = "wbr".voidTag[dom.html.Element]
  // Edits
  lazy val ins = "ins".tag[dom.html.Mod]
  lazy val del = "del".tag[dom.html.Mod]
  // Embedded content
  lazy val img = "img".voidTag[dom.html.Image]
  lazy val iframe = "iframe".tag[dom.html.IFrame]
  lazy val embed = "embed".voidTag[dom.html.Embed]
  lazy val `object` = "object".tag[dom.html.Object]
  lazy val param = "param".voidTag[dom.html.Param]
  lazy val video = "video".tag[dom.html.Video]
  lazy val audio = "audio".tag[dom.html.Audio]
  lazy val source = "source".voidTag[dom.html.Source]
  lazy val track = "track".voidTag[dom.html.Track]
  lazy val canvas = "canvas".tag[dom.html.Canvas]
  lazy val map = "map".tag[dom.html.Map]
  lazy val area = "area".voidTag[dom.html.Area]
  // Tabular data
  lazy val table = "table".tag[dom.html.Table]
  lazy val caption = "caption".tag[dom.html.TableCaption]
  lazy val colgroup = "colgroup".tag[dom.html.TableCol]
  lazy val col = "col".voidTag[dom.html.TableCol]
  lazy val tbody = "tbody".tag[dom.html.TableSection]
  lazy val thead = "thead".tag[dom.html.TableSection]
  lazy val tfoot = "tfoot".tag[dom.html.TableSection]
  lazy val tr = "tr".tag[dom.html.TableRow]
  lazy val td = "td".tag[dom.html.TableCell]
  lazy val th = "th".tag[dom.html.TableHeaderCell]
  // Forms
  lazy val form = "form".tag[dom.html.Form]
  lazy val fieldset = "fieldset".tag[dom.html.FieldSet]
  lazy val legend = "legend".tag[dom.html.Legend]
  lazy val label = "label".tag[dom.html.Label]
  lazy val input = "input".voidTag[dom.html.Input]
  lazy val button = "button".tag[dom.html.Button]
  lazy val select = "select".tag[dom.html.Select]
  lazy val datalist = "datalist".tag[dom.html.DataList]
  lazy val optgroup = "optgroup".tag[dom.html.OptGroup]
  lazy val option = "option".tag[dom.html.Option]
  lazy val textarea = "textarea".tag[dom.html.TextArea]
}
