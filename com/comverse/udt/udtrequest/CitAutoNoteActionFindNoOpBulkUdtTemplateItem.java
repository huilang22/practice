/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitAutoNoteActionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitAutoNoteActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitAutoNoteActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitAutoNoteActionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitAutoNoteActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitAutoNoteActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitAutoNoteActionObjectDataList noOpInIn) {
    super(id, context, "CitAutoNoteActionFind");
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
        mapArray[i] = CitAutoNoteActionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitAutoNoteAction", noOpIn);
      }
      addInput("CitAutoNoteAction", mapList);
    }
  }
/**
 *
 * Sets the  CitAutoNoteAction
 * @param noOpInIn CitAutoNoteActionObjectDataList to set
 *
 */
  public void setCitAutoNoteAction(CitAutoNoteActionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitAutoNoteAction passed into the constructor
 * @return Simulated response
 *
 */
  public CitAutoNoteActionObjectDataList getCitAutoNoteAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitAutoNoteActionObjectHelper.fromMapList(inputMap, "CitAutoNoteActionList");
  }
}
