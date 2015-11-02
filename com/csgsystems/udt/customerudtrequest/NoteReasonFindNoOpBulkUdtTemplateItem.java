/*
 * Generated code DO NOT EDIT
 * Generated file: NoteReasonFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a NoteReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteReasonObjectDataList noOpInIn) {
    super(id, context, "NoteReasonFind");
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
        mapArray[i] = NoteReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteReason", noOpIn);
      }
      addInput("NoteReason", mapList);
    }
  }
/**
 *
 * Sets the  NoteReason
 * @param noOpInIn NoteReasonObjectDataList to set
 *
 */
  public void setNoteReason(NoteReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteReason passed into the constructor
 * @return Simulated response
 *
 */
  public NoteReasonObjectDataList getNoteReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteReasonObjectHelper.fromMapList(inputMap, "NoteReasonList");
  }
}
