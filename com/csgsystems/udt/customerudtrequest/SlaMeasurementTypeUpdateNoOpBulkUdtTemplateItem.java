/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SlaMeasurementTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SlaMeasurementTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SlaMeasurementTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   SlaMeasurementTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SlaMeasurementTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementTypeObjectData noOpInIn) {
    super(id, context, "SlaMeasurementTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(noOpIn, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }
/**
 *
 * Sets the  SlaMeasurementType
 * @param noOpInIn SlaMeasurementTypeObjectData to set
 *
 */
  public void setSlaMeasurementType(SlaMeasurementTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SlaMeasurementType passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementTypeObjectData getSlaMeasurementType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SlaMeasurementTypeObjectHelper.fromMap(inputMap, "SlaMeasurementType");
  }
}
