/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionGetBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsGeographicRegionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsGeographicRegionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsGeographicRegionObjectKeyData InvsGeographicRegionGetIn;
/**
 *
 * Constructor to create a  InvsGeographicRegionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsGeographicRegionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsGeographicRegionObjectKeyData InvsGeographicRegionGetInIn) {
    super(id, context, "InvsGeographicRegionGet");
    InvsGeographicRegionGetIn = InvsGeographicRegionGetInIn;
  }

  public void translateToMap() {
    if (InvsGeographicRegionGetIn != null) {
      InvsGeographicRegionGetIn.resetFlags(true, true);
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectKeyHelper.toMap(InvsGeographicRegionGetIn, new HashMap(), "InvsGeographicRegionObjectKeyData").get("InvsGeographicRegionObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsGeographicRegion
 * @param InvsGeographicRegionGetInIn Value of the InvsGeographicRegionGetIn
 *
 */

  public void setInvsGeographicRegion(InvsGeographicRegionObjectKeyData InvsGeographicRegionGetInIn) {
    InvsGeographicRegionGetIn = InvsGeographicRegionGetInIn;
  }

  public void translateFromMap() {
    InvsGeographicRegionGetIn = InvsGeographicRegionObjectKeyHelper.fromMap(inputMap, "InvsGeographicRegion");
  }

/**
 *
 * Gets the InvsGeographicRegion
 * @return Value of the InvsGeographicRegion
 *
 */

  public InvsGeographicRegionObjectKeyData getInvsGeographicRegion( ) {
    return InvsGeographicRegionGetIn;
  }

}
