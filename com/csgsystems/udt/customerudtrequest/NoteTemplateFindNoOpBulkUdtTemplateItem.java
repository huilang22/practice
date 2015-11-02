/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTemplateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NoteTemplateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NoteTemplateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NoteTemplateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NoteTemplateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NoteTemplateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NoteTemplateObjectDataList noOpInIn) {
    super(id, context, "NoteTemplateFind");
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
        mapArray[i] = NoteTemplateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NoteTemplate", noOpIn);
      }
      addInput("NoteTemplate", mapList);
    }
  }
/**
 *
 * Sets the  NoteTemplate
 * @param noOpInIn NoteTemplateObjectDataList to set
 *
 */
  public void setNoteTemplate(NoteTemplateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NoteTemplate passed into the constructor
 * @return Simulated response
 *
 */
  public NoteTemplateObjectDataList getNoteTemplate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NoteTemplateObjectHelper.fromMapList(inputMap, "NoteTemplateList");
  }
}
