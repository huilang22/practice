/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteObjectDataList noOpInIn) {
    super(id, context, "NoteFind");
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
        mapArray[i] = NoteObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Note", noOpIn);
      }
      addInput("Note", mapList);
    }
  }
/**
 *
 * Sets the  Note
 * @param noOpInIn NoteObjectDataList to set
 *
 */
  public void setNote(NoteObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Note passed into the constructor
 * @return Simulated response
 *
 */
  public NoteObjectDataList getNote() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteObjectHelper.fromMapList(inputMap, "NoteList");
  }
}
