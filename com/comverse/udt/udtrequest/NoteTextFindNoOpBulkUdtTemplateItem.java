/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTextFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NoteTextFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTextFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTextObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteTextFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTextFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTextObjectDataList noOpInIn) {
    super(id, context, "NoteTextFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = NoteTextObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteText", noOpIn);
      }
      addInput("NoteText", mapList);
    }
  }
/**
 *
 * Sets the  NoteText
 * @param noOpInIn NoteTextObjectDataList to set
 *
 */
  public void setNoteText(NoteTextObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteText passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTextObjectDataList getNoteText() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTextObjectHelper.fromMapList(inputMap, "NoteTextList");
  }
}
