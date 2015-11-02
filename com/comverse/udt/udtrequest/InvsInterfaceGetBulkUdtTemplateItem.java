/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsInterfaceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsInterfaceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsInterfaceObjectKeyData InvsInterfaceGetIn;
/**
 *
 * Constructor to create a  InvsInterfaceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsInterfaceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceObjectKeyData InvsInterfaceGetInIn) {
    super(id, context, "InvsInterfaceGet");
    InvsInterfaceGetIn = InvsInterfaceGetInIn;
  }

  public void translateToMap() {
    if (InvsInterfaceGetIn != null) {
      InvsInterfaceGetIn.resetFlags(true, true);
      addInput("InvsInterface", InvsInterfaceObjectKeyHelper.toMap(InvsInterfaceGetIn, new HashMap(), "InvsInterfaceObjectKeyData").get("InvsInterfaceObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsInterface
 * @param InvsInterfaceGetInIn Value of the InvsInterfaceGetIn
 *
 */

  public void setInvsInterface(InvsInterfaceObjectKeyData InvsInterfaceGetInIn) {
    InvsInterfaceGetIn = InvsInterfaceGetInIn;
  }

  public void translateFromMap() {
    InvsInterfaceGetIn = InvsInterfaceObjectKeyHelper.fromMap(inputMap, "InvsInterface");
  }

/**
 *
 * Gets the InvsInterface
 * @return Value of the InvsInterface
 *
 */

  public InvsInterfaceObjectKeyData getInvsInterface( ) {
    return InvsInterfaceGetIn;
  }

}
