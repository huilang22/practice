/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsGeographicRegionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsGeographicRegionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsGeographicRegionObjectData InvsGeographicRegionCreateIn;
/**
 *
 * Constructor to create a  InvsGeographicRegionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsGeographicRegionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsGeographicRegionObjectData InvsGeographicRegionCreateInIn) {
    super(id, context, "InvsGeographicRegionCreate");
    InvsGeographicRegionCreateIn = InvsGeographicRegionCreateInIn;
  }

  public void translateToMap() {
    if (InvsGeographicRegionCreateIn != null) {
      InvsGeographicRegionCreateIn.resetFlags(true, true);
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(InvsGeographicRegionCreateIn, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }


/**
 *
 * Sets the InvsGeographicRegion
 * @param InvsGeographicRegionCreateInIn Value of the InvsGeographicRegionCreateIn
 *
 */

  public void setInvsGeographicRegion(InvsGeographicRegionObjectData InvsGeographicRegionCreateInIn) {
    InvsGeographicRegionCreateIn = InvsGeographicRegionCreateInIn;
  }

  public void translateFromMap() {
    InvsGeographicRegionCreateIn = InvsGeographicRegionObjectHelper.fromMap(inputMap, "InvsGeographicRegion");
  }

/**
 *
 * Gets the InvsGeographicRegion
 * @return Value of the InvsGeographicRegion
 *
 */

  public InvsGeographicRegionObjectData getInvsGeographicRegion( ) {
    return InvsGeographicRegionCreateIn;
  }

}
