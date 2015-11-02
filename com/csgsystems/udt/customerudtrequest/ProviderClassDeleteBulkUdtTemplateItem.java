/*
 * Generated code DO NOT EDIT
 * Generated file: ProviderClassDeleteBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a ProviderClassDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ProviderClassDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProvClsObjectKeyData ProvClsDeleteIn;
/**
 *
 * Constructor to create a  ProviderClassDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProviderClassDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ProvClsObjectKeyData ProvClsDeleteInIn) {
    super(id, context, "ProviderClassDelete");
    ProvClsDeleteIn = ProvClsDeleteInIn;
  }

  public void translateToMap() {
    if (ProvClsDeleteIn != null) {
      ProvClsDeleteIn.resetFlags(true, true);
      addInput("ProviderClass", ProvClsObjectKeyHelper.toMap(ProvClsDeleteIn, new HashMap(), "ProvClsObjectKeyData").get("ProvClsObjectKeyData"));
    }
  }


/**
 *
 * Sets the ProviderClass
 * @param ProvClsDeleteInIn Value of the ProvClsDeleteIn
 *
 */

  public void setProviderClass(ProvClsObjectKeyData ProvClsDeleteInIn) {
    ProvClsDeleteIn = ProvClsDeleteInIn;
  }

  public void translateFromMap() {
    ProvClsDeleteIn = ProvClsObjectKeyHelper.fromMap(inputMap, "ProviderClass");
  }

/**
 *
 * Gets the ProviderClass
 * @return Value of the ProviderClass
 *
 */

  public ProvClsObjectKeyData getProviderClass( ) {
    return ProvClsDeleteIn;
  }

}
