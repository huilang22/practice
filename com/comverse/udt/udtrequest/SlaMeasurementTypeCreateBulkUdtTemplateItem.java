/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeCreateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a SlaMeasurementTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class SlaMeasurementTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SlaMeasurementTypeObjectData SLAMTcreate_In;
/**
 *
 * Constructor to create a  SlaMeasurementTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SlaMeasurementTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementTypeObjectData SLAMTcreate_InIn) {
    super(id, context, "SlaMeasurementTypeCreate");
    SLAMTcreate_In = SLAMTcreate_InIn;
  }

  public void translateToMap() {
    if (SLAMTcreate_In != null) {
      SLAMTcreate_In.resetFlags(true, true);
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(SLAMTcreate_In, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }


/**
 *
 * Sets the SlaMeasurementType
 * @param SLAMTcreate_InIn Value of the SLAMTcreate_In
 *
 */

  public void setSlaMeasurementType(SlaMeasurementTypeObjectData SLAMTcreate_InIn) {
    SLAMTcreate_In = SLAMTcreate_InIn;
  }

  public void translateFromMap() {
    SLAMTcreate_In = SlaMeasurementTypeObjectHelper.fromMap(inputMap, "SlaMeasurementType");
  }

/**
 *
 * Gets the SlaMeasurementType
 * @return Value of the SlaMeasurementType
 *
 */

  public SlaMeasurementTypeObjectData getSlaMeasurementType( ) {
    return SLAMTcreate_In;
  }

}
