package List

import java.lang.StringBuilder

class PointList(var value: Any, var nextPointList : PointList?){

  fun add( currentPointList: PointList, value : Any) {
      val endList = PointList(value, null)
      currentPointList.nextPointList = endList
  }


  fun display( list: PointList?) : String{

      if(list == null){
            return "To Bad it's null"
      }
      val str = StringBuilder()
      var listItem = list;
      while(listItem.nextPointList != null){
          str.append("{ value ")
          str.append(list.value)
          str.append(" } \n")
      }
      return str.toString()
  }
}