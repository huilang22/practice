/*
 * Generated code DO NOT EDIT
 * Generated file: CitInteractionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitInteractionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitInteractionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitInteractionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitInteractionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitInteractionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionObjectDataList noOpInIn) {
    super(id, context, "CitInteractionFind");
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
        mapArray[i] = CitInteractionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitInteraction", noOpIn);
      }
      addInput("CitInteraction", mapList);
    }
  }
/**
 *
 * Sets the  CitInteraction
 * @param noOpInIn CitInteractionObjectDataList to set
 *
 */
  public void setCitInteraction(CitInteractionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitInteraction passed into the constructor
 * @return Simulated response
 *
 */
  public CitInteractionObjectDataList getCitInteraction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitInteractionObjectHelper.fromMapList(inputMap, "CitInteractionList");
  }
}
