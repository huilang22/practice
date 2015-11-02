/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a SlaMeasurementDataGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SlaMeasurementDataGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SlaMeasurementDataObjectData noOpIn;

/**
 *
 * Constructor to create a   SlaMeasurementDataGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SlaMeasurementDataGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementDataObjectData noOpInIn) {
    super(id, context, "SlaMeasurementDataGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SlaMeasurementData", SlaMeasurementDataObjectHelper.toMap(noOpIn, new HashMap(), "SlaMeasurementData").get("SlaMeasurementData"));
    }
  }
/**
 *
 * Sets the  SlaMeasurementData
 * @param noOpInIn SlaMeasurementDataObjectData to set
 *
 */
  public void setSlaMeasurementData(SlaMeasurementDataObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SlaMeasurementData passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementDataObjectData getSlaMeasurementData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SlaMeasurementDataObjectHelper.fromMap(inputMap, "SlaMeasurementData");
  }
}
