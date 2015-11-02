/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdAcctMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExternalIdAcctMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalIdAcctMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EIAMObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExternalIdAcctMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalIdAcctMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EIAMObjectDataList noOpInIn) {
    super(id, context, "ExternalIdAcctMapFind");
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
        mapArray[i] = EIAMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalIdAcctMap", noOpIn);
      }
      addInput("ExternalIdAcctMap", mapList);
    }
  }
/**
 *
 * Sets the  ExternalIdAcctMap
 * @param noOpInIn EIAMObjectDataList to set
 *
 */
  public void setExternalIdAcctMap(EIAMObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalIdAcctMap passed into the constructor
 * @return Simulated response
 *
 */
  public EIAMObjectDataList getExternalIdAcctMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EIAMObjectHelper.fromMapList(inputMap, "ExternalIdAcctMapList");
  }
}
