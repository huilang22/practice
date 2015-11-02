/*
 * Generated code DO NOT EDIT
 * Generated file: NoteCodeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NoteCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteCodeObjectDataList noOpInIn) {
    super(id, context, "NoteCodeFind");
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
        mapArray[i] = NoteCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteCode", noOpIn);
      }
      addInput("NoteCode", mapList);
    }
  }
/**
 *
 * Sets the  NoteCode
 * @param noOpInIn NoteCodeObjectDataList to set
 *
 */
  public void setNoteCode(NoteCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteCode passed into the constructor
 * @return Simulated response
 *
 */
  public NoteCodeObjectDataList getNoteCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteCodeObjectHelper.fromMapList(inputMap, "NoteCodeList");
  }
}
