/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassGetBulkUdtTemplateItem.java
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
 * Class used to create a ProviderClassGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ProviderClassGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProvClsObjectKeyData ProvClsGetIn;
/**
 *
 * Constructor to create a  ProviderClassGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProviderClassGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ProvClsObjectKeyData ProvClsGetInIn) {
    super(id, context, "ProviderClassGet");
    ProvClsGetIn = ProvClsGetInIn;
  }

  public void translateToMap() {
    if (ProvClsGetIn != null) {
      ProvClsGetIn.resetFlags(true, true);
      addInput("ProviderClass", ProvClsObjectKeyHelper.toMap(ProvClsGetIn, new HashMap(), "ProvClsObjectKeyData").get("ProvClsObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProviderClass
 * @param ProvClsGetInIn Value of the ProvClsGetIn
 *
 */

  public void setProviderClass(ProvClsObjectKeyData ProvClsGetInIn) {
    ProvClsGetIn = ProvClsGetInIn;
  }

  public void translateFromMap() {
    ProvClsGetIn = ProvClsObjectKeyHelper.fromMap(inputMap, "ProviderClass");
  }

/**
 *
 * Gets the ProviderClass
 * @return Value of the ProviderClass
 *
 */

  public ProvClsObjectKeyData getProviderClass( ) {
    return ProvClsGetIn;
  }

}
