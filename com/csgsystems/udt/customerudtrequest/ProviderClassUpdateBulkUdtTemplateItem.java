/*
 * Generated code DO NOT EDIT
 * Generated file: ProviderClassUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ProviderClassUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ProviderClassUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProvClsObjectData ProvClsUpdateIn;
/**
 *
 * Constructor to create a  ProviderClassUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProviderClassUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProvClsObjectData ProvClsUpdateInIn) {
    super(id, context, "ProviderClassUpdate");
    ProvClsUpdateIn = ProvClsUpdateInIn;
  }

  public void translateToMap() {
    if (ProvClsUpdateIn != null) {
      ProvClsUpdateIn.resetFlags(true, true);
      addInput("ProviderClass", ProvClsObjectHelper.toMap(ProvClsUpdateIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }


/**
 *
 * Sets the ProviderClass
 * @param ProvClsUpdateInIn Value of the ProvClsUpdateIn
 *
 */

  public void setProviderClass(ProvClsObjectData ProvClsUpdateInIn) {
    ProvClsUpdateIn = ProvClsUpdateInIn;
  }

  public void translateFromMap() {
    ProvClsUpdateIn = ProvClsObjectHelper.fromMap(inputMap, "ProviderClass");
  }

/**
 *
 * Gets the ProviderClass
 * @return Value of the ProviderClass
 *
 */

  public ProvClsObjectData getProviderClass( ) {
    return ProvClsUpdateIn;
  }

}
