/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTypeObjectDataList noOpInIn) {
    super(id, context, "NoteTypeFind");
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
        mapArray[i] = NoteTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteType", noOpIn);
      }
      addInput("NoteType", mapList);
    }
  }
/**
 *
 * Sets the  NoteType
 * @param noOpInIn NoteTypeObjectDataList to set
 *
 */
  public void setNoteType(NoteTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteType passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTypeObjectDataList getNoteType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTypeObjectHelper.fromMapList(inputMap, "NoteTypeList");
  }
}
