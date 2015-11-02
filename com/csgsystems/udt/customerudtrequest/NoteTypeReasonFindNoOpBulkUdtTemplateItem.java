/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeReasonFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTypeReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTypeReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTypeReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteTypeReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTypeReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeReasonObjectDataList noOpInIn) {
    super(id, context, "NoteTypeReasonFind");
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
        mapArray[i] = NoteTypeReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteTypeReason", noOpIn);
      }
      addInput("NoteTypeReason", mapList);
    }
  }
/**
 *
 * Sets the  NoteTypeReason
 * @param noOpInIn NoteTypeReasonObjectDataList to set
 *
 */
  public void setNoteTypeReason(NoteTypeReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteTypeReason passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeReasonObjectDataList getNoteTypeReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTypeReasonObjectHelper.fromMapList(inputMap, "NoteTypeReasonList");
  }
}
