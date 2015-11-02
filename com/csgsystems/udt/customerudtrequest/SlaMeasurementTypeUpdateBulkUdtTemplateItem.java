/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a SlaMeasurementTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class SlaMeasurementTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SlaMeasurementTypeObjectData SLAMTupdate_In;
/**
 *
 * Constructor to create a  SlaMeasurementTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SlaMeasurementTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementTypeObjectData SLAMTupdate_InIn) {
    super(id, context, "SlaMeasurementTypeUpdate");
    SLAMTupdate_In = SLAMTupdate_InIn;
  }

  public void translateToMap() {
    if (SLAMTupdate_In != null) {
      SLAMTupdate_In.resetFlags(true, true);
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(SLAMTupdate_In, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }


/**
 *
 * Sets the SlaMeasurementType
 * @param SLAMTupdate_InIn Value of the SLAMTupdate_In
 *
 */

  public void setSlaMeasurementType(SlaMeasurementTypeObjectData SLAMTupdate_InIn) {
    SLAMTupdate_In = SLAMTupdate_InIn;
  }

  public void translateFromMap() {
    SLAMTupdate_In = SlaMeasurementTypeObjectHelper.fromMap(inputMap, "SlaMeasurementType");
  }

/**
 *
 * Gets the SlaMeasurementType
 * @return Value of the SlaMeasurementType
 *
 */

  public SlaMeasurementTypeObjectData getSlaMeasurementType( ) {
    return SLAMTupdate_In;
  }

}
