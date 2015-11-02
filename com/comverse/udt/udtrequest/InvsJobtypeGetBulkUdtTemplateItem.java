/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobtypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobtypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobtypeObjectKeyData InvsJobtypeGetIn;
/**
 *
 * Constructor to create a  InvsJobtypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobtypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobtypeObjectKeyData InvsJobtypeGetInIn) {
    super(id, context, "InvsJobtypeGet");
    InvsJobtypeGetIn = InvsJobtypeGetInIn;
  }

  public void translateToMap() {
    if (InvsJobtypeGetIn != null) {
      InvsJobtypeGetIn.resetFlags(true, true);
      addInput("InvsJobtype", InvsJobtypeObjectKeyHelper.toMap(InvsJobtypeGetIn, new HashMap(), "InvsJobtypeObjectKeyData").get("InvsJobtypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsJobtype
 * @param InvsJobtypeGetInIn Value of the InvsJobtypeGetIn
 *
 */

  public void setInvsJobtype(InvsJobtypeObjectKeyData InvsJobtypeGetInIn) {
    InvsJobtypeGetIn = InvsJobtypeGetInIn;
  }

  public void translateFromMap() {
    InvsJobtypeGetIn = InvsJobtypeObjectKeyHelper.fromMap(inputMap, "InvsJobtype");
  }

/**
 *
 * Gets the InvsJobtype
 * @return Value of the InvsJobtype
 *
 */

  public InvsJobtypeObjectKeyData getInvsJobtype( ) {
    return InvsJobtypeGetIn;
  }

}
