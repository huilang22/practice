/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointRegionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PointRegionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PointRegionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PointRegionObjectKeyData PRDeleteIn;
/**
 *
 * Constructor to create a  PointRegionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PointRegionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PointRegionObjectKeyData PRDeleteInIn) {
    super(id, context, "PointRegionDelete");
    PRDeleteIn = PRDeleteInIn;
  }

  public void translateToMap() {
    if (PRDeleteIn != null) {
      PRDeleteIn.resetFlags(true, true);
      addInput("PointRegion", PointRegionObjectKeyHelper.toMap(PRDeleteIn, new HashMap(), "PointRegionObjectKeyData").get("PointRegionObjectKeyData"));
    }
  }


/**
 *
 * Sets the PointRegion
 * @param PRDeleteInIn Value of the PRDeleteIn
 *
 */

  public void setPointRegion(PointRegionObjectKeyData PRDeleteInIn) {
    PRDeleteIn = PRDeleteInIn;
  }

  public void translateFromMap() {
    PRDeleteIn = PointRegionObjectKeyHelper.fromMap(inputMap, "PointRegion");
  }

/**
 *
 * Gets the PointRegion
 * @return Value of the PointRegion
 *
 */

  public PointRegionObjectKeyData getPointRegion( ) {
    return PRDeleteIn;
  }

}
