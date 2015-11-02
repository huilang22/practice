/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a SlaMeasurementTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class SlaMeasurementTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SlaMeasurementTypeObjectKeyData SLAMTdelete_In;
/**
 *
 * Constructor to create a  SlaMeasurementTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SlaMeasurementTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementTypeObjectKeyData SLAMTdelete_InIn) {
    super(id, context, "SlaMeasurementTypeDelete");
    SLAMTdelete_In = SLAMTdelete_InIn;
  }

  public void translateToMap() {
    if (SLAMTdelete_In != null) {
      SLAMTdelete_In.resetFlags(true, true);
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectKeyHelper.toMap(SLAMTdelete_In, new HashMap(), "SlaMeasurementTypeObjectKeyData").get("SlaMeasurementTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the SlaMeasurementType
 * @param SLAMTdelete_InIn Value of the SLAMTdelete_In
 *
 */

  public void setSlaMeasurementType(SlaMeasurementTypeObjectKeyData SLAMTdelete_InIn) {
    SLAMTdelete_In = SLAMTdelete_InIn;
  }

  public void translateFromMap() {
    SLAMTdelete_In = SlaMeasurementTypeObjectKeyHelper.fromMap(inputMap, "SlaMeasurementType");
  }

/**
 *
 * Gets the SlaMeasurementType
 * @return Value of the SlaMeasurementType
 *
 */

  public SlaMeasurementTypeObjectKeyData getSlaMeasurementType( ) {
    return SLAMTdelete_In;
  }

}
