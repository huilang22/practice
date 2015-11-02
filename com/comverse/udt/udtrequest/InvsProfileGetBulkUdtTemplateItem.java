/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileGetBulkUdtTemplateItem.java
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
 * Class used to create a InvsProfileGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsProfileGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsProfileObjectKeyData InvsProfileGetIn;
/**
 *
 * Constructor to create a  InvsProfileGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsProfileGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsProfileObjectKeyData InvsProfileGetInIn) {
    super(id, context, "InvsProfileGet");
    InvsProfileGetIn = InvsProfileGetInIn;
  }

  public void translateToMap() {
    if (InvsProfileGetIn != null) {
      InvsProfileGetIn.resetFlags(true, true);
      addInput("InvsProfile", InvsProfileObjectKeyHelper.toMap(InvsProfileGetIn, new HashMap(), "InvsProfileObjectKeyData").get("InvsProfileObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvsProfile
 * @param InvsProfileGetInIn Value of the InvsProfileGetIn
 *
 */

  public void setInvsProfile(InvsProfileObjectKeyData InvsProfileGetInIn) {
    InvsProfileGetIn = InvsProfileGetInIn;
  }

  public void translateFromMap() {
    InvsProfileGetIn = InvsProfileObjectKeyHelper.fromMap(inputMap, "InvsProfile");
  }

/**
 *
 * Gets the InvsProfile
 * @return Value of the InvsProfile
 *
 */

  public InvsProfileObjectKeyData getInvsProfile( ) {
    return InvsProfileGetIn;
  }

}
