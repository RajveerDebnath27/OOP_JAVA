public class book
{
 private int Bid;
 private string Bname;
 private string AuthorName;

 

 public book(int bid, string bn, string An)
 {
  Bid=bid;
  Bname=bn;
  Authorname=An;
 }
 public void setBid(int bid)
 {
  Bid=bid;
 }
 public void setBname(string bn)
 {
 Bname=bn;
 }
 public void setAuthorName(string An)
 {
  Authorname=An;
 }
 public int getBid()
 {
  return Bid;
 }
 public string getBname()
 {
 return Bname;
 }
 public string getAuthorName()
 {
  return AuthorName;
 }
};
 