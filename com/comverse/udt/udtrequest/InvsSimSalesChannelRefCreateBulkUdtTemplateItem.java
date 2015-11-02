/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefCreateIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefCreateInIn) {
    super(id, context, "InvsSimSalesChannelRefCreate");
    InvsSimSalesChannelRefCreateIn = InvsSimSalesChannelRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelRefCreateIn != null) {
      InvsSimSalesChannelRefCreateIn.resetFlags(true, true);
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(InvsSimSalesChannelRefCreateIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannelRef
 * @param InvsSimSalesChannelRefCreateInIn Value of the InvsSimSalesChannelRefCreateIn
 *
 */

  public void setInvsSimSalesChannelRef(InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefCreateInIn) {
    InvsSimSalesChannelRefCreateIn = InvsSimSalesChannelRefCreateInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelRefCreateIn = InvsSimSalesChannelRefObjectHelper.fromMap(inputMap, "InvsSimSalesChannelRef");
  }

/**
 *
 * Gets the InvsSimSalesChannelRef
 * @return Value of the InvsSimSalesChannelRef
 *
 */

  public InvsSimSalesChannelRefObjectData getInvsSimSalesChannelRef( ) {
    return InvsSimSalesChannelRefCreateIn;
  }

}
