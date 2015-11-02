/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceRefCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceRefCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceRefObjectData InvsInterfaceRefCreateIn;
/**
 *
 * Constructor to create a  InvsInterfaceRefCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceRefCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceRefObjectData InvsInterfaceRefCreateInIn) {
    super(id, context, "InvsInterfaceRefCreate");
    InvsInterfaceRefCreateIn = InvsInterfaceRefCreateInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceRefCreateIn != null) {
      InvsInterfaceRefCreateIn.resetFlags(true, true);
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(InvsInterfaceRefCreateIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }


/**
 *
 * Sets the InvsInterfaceRef
 * @param InvsInterfaceRefCreateInIn Value of the InvsInterfaceRefCreateIn
 *
 */

  public void setInvsInterfaceRef(InvsInterfaceRefObjectData InvsInterfaceRefCreateInIn) {
    InvsInterfaceRefCreateIn = InvsInterfaceRefCreateInIn;
  }

  public void translateFromMap() {
    InvsInterfaceRefCreateIn = InvsInterfaceRefObjectHelper.fromMap(inputMap, "InvsInterfaceRef");
  }

/**
 *
 * Gets the InvsInterfaceRef
 * @return Value of the InvsInterfaceRef
 *
 */

  public InvsInterfaceRefObjectData getInvsInterfaceRef( ) {
    return InvsInterfaceRefCreateIn;
  }

}
