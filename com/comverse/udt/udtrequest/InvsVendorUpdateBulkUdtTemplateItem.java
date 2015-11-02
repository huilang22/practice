/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsVendorUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorObjectData InvsVendorUpdateIn;
/**
 *
 * Constructor to create a  InvsVendorUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorObjectData InvsVendorUpdateInIn) {
    super(id, context, "InvsVendorUpdate");
    InvsVendorUpdateIn = InvsVendorUpdateInIn;
  }

  public void translateToMap() {
    if (InvsVendorUpdateIn != null) {
      InvsVendorUpdateIn.resetFlags(true, true);
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(InvsVendorUpdateIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }


/**
 *
 * Sets the InvsVendor
 * @param InvsVendorUpdateInIn Value of the InvsVendorUpdateIn
 *
 */

  public void setInvsVendor(InvsVendorObjectData InvsVendorUpdateInIn) {
    InvsVendorUpdateIn = InvsVendorUpdateInIn;
  }

  public void translateFromMap() {
    InvsVendorUpdateIn = InvsVendorObjectHelper.fromMap(inputMap, "InvsVendor");
  }

/**
 *
 * Gets the InvsVendor
 * @return Value of the InvsVendor
 *
 */

  public InvsVendorObjectData getInvsVendor( ) {
    return InvsVendorUpdateIn;
  }

}
