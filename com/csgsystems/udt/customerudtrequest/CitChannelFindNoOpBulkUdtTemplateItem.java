/*
 * Generated code DO NOT EDIT
 * Generated file: CitChannelFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitChannelFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitChannelFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitChannelObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitChannelFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitChannelFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitChannelObjectDataList noOpInIn) {
    super(id, context, "CitChannelFind");
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
        mapArray[i] = CitChannelObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitChannel", noOpIn);
      }
      addInput("CitChannel", mapList);
    }
  }
/**
 *
 * Sets the  CitChannel
 * @param noOpInIn CitChannelObjectDataList to set
 *
 */
  public void setCitChannel(CitChannelObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitChannel passed into the constructor
 * @return Simulated response
 *
 */
  public CitChannelObjectDataList getCitChannel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitChannelObjectHelper.fromMapList(inputMap, "CitChannelList");
  }
}
