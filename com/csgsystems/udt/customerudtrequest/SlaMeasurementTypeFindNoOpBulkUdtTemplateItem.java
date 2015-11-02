/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SlaMeasurementTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SlaMeasurementTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SlaMeasurementTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SlaMeasurementTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SlaMeasurementTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementTypeObjectDataList noOpInIn) {
    super(id, context, "SlaMeasurementTypeFind");
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
        mapArray[i] = SlaMeasurementTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SlaMeasurementType", noOpIn);
      }
      addInput("SlaMeasurementType", mapList);
    }
  }
/**
 *
 * Sets the  SlaMeasurementType
 * @param noOpInIn SlaMeasurementTypeObjectDataList to set
 *
 */
  public void setSlaMeasurementType(SlaMeasurementTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SlaMeasurementType passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementTypeObjectDataList getSlaMeasurementType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SlaMeasurementTypeObjectHelper.fromMapList(inputMap, "SlaMeasurementTypeList");
  }
}
