/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigurationFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EmfConfigurationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EmfConfigurationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EmfConfigurationObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EmfConfigurationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EmfConfigurationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigurationObjectDataList noOpInIn) {
    super(id, context, "EmfConfigurationFind");
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
        mapArray[i] = EmfConfigurationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EmfConfiguration", noOpIn);
      }
      addInput("EmfConfiguration", mapList);
    }
  }
/**
 *
 * Sets the  EmfConfiguration
 * @param noOpInIn EmfConfigurationObjectDataList to set
 *
 */
  public void setEmfConfiguration(EmfConfigurationObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EmfConfiguration passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigurationObjectDataList getEmfConfiguration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EmfConfigurationObjectHelper.fromMapList(inputMap, "EmfConfigurationList");
  }
}
