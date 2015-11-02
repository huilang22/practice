/*
 * Generated code DO NOT EDIT
 * Generated file: EnhancedNoteFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EnhancedNoteFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EnhancedNoteFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EnhancedNoteObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EnhancedNoteFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EnhancedNoteFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectDataList noOpInIn) {
    super(id, context, "EnhancedNoteFind");
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
        mapArray[i] = EnhancedNoteObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EnhancedNote", noOpIn);
      }
      addInput("EnhancedNote", mapList);
    }
  }
/**
 *
 * Sets the  EnhancedNote
 * @param noOpInIn EnhancedNoteObjectDataList to set
 *
 */
  public void setEnhancedNote(EnhancedNoteObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EnhancedNote passed into the constructor
 * @return Simulated response
 *
 */
  public EnhancedNoteObjectDataList getEnhancedNote() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EnhancedNoteObjectHelper.fromMapList(inputMap, "EnhancedNoteList");
  }
}
