/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a SlaMeasurementTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SlaMeasurementTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SlaMeasurementTypeObjectKeyData SLAMTget_In;
/**
 *
 * Constructor to create a  SlaMeasurementTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SlaMeasurementTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementTypeObjectKeyData SLAMTget_InIn) {
    super(id, context, "SlaMeasurementTypeGet");
    SLAMTget_In = SLAMTget_InIn;
  }

  public void translateToMap() {
    if (SLAMTget_In != null) {
      SLAMTget_In.resetFlags(true, true);
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectKeyHelper.toMap(SLAMTget_In, new HashMap(), "SlaMeasurementTypeObjectKeyData").get("SlaMeasurementTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the SlaMeasurementType
 * @param SLAMTget_InIn Value of the SLAMTget_In
 *
 */

  public void setSlaMeasurementType(SlaMeasurementTypeObjectKeyData SLAMTget_InIn) {
    SLAMTget_In = SLAMTget_InIn;
  }

  public void translateFromMap() {
    SLAMTget_In = SlaMeasurementTypeObjectKeyHelper.fromMap(inputMap, "SlaMeasurementType");
  }

/**
 *
 * Gets the SlaMeasurementType
 * @return Value of the SlaMeasurementType
 *
 */

  public SlaMeasurementTypeObjectKeyData getSlaMeasurementType( ) {
    return SLAMTget_In;
  }

}
