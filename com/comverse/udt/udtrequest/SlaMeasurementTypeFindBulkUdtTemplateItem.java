/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a SlaMeasurementTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SlaMeasurementTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SlaMeasurementTypeObjectFilter SLAMTfind_In;
/**
 *
 * Constructor to create a  SlaMeasurementTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SlaMeasurementTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SlaMeasurementTypeObjectFilter SLAMTfind_InIn) {
    super(id, context, "SlaMeasurementTypeFind");
    SLAMTfind_In = SLAMTfind_InIn;
  }

  public void translateToMap() {
    if (SLAMTfind_In != null) {
      Integer index =  SLAMTfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(SLAMTfind_In, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }


/**
 *
 * Sets the SlaMeasurementType
 * @param SLAMTfind_InIn Value of the SLAMTfind_In
 *
 */

  public void setSlaMeasurementType(SlaMeasurementTypeObjectFilter SLAMTfind_InIn) {
    SLAMTfind_In = SLAMTfind_InIn;
  }

  public void translateFromMap() {
    SLAMTfind_In = SlaMeasurementTypeObjectHelper.fromMapFilter(inputMap, "SlaMeasurementType");
  }

/**
 *
 * Gets the SlaMeasurementType
 * @return Value of the SlaMeasurementType
 *
 */

  public SlaMeasurementTypeObjectFilter getSlaMeasurementType( ) {
    return SLAMTfind_In;
  }

}
