/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsVendorRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsVendorRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsVendorRefObjectData InvsVendorRefCreateIn;
/**
 *
 * Constructor to create a  InvsVendorRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsVendorRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorRefObjectData InvsVendorRefCreateInIn) {
    super(id, context, "InvsVendorRefCreate");
    InvsVendorRefCreateIn = InvsVendorRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsVendorRefCreateIn != null) {
      InvsVendorRefCreateIn.resetFlags(true, true);
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(InvsVendorRefCreateIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }


/**
 *
 * Sets the InvsVendorRef
 * @param InvsVendorRefCreateInIn Value of the InvsVendorRefCreateIn
 *
 */

  public void setInvsVendorRef(InvsVendorRefObjectData InvsVendorRefCreateInIn) {
    InvsVendorRefCreateIn = InvsVendorRefCreateInIn;
  }

  public void translateFromMap() {
    InvsVendorRefCreateIn = InvsVendorRefObjectHelper.fromMap(inputMap, "InvsVendorRef");
  }

/**
 *
 * Gets the InvsVendorRef
 * @return Value of the InvsVendorRef
 *
 */

  public InvsVendorRefObjectData getInvsVendorRef( ) {
    return InvsVendorRefCreateIn;
  }

}
