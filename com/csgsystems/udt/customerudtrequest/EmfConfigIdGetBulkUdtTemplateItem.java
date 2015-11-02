/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigIdGetBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigIdGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigIdGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECIObjectKeyData ECIGetIn;
/**
 *
 * Constructor to create a  EmfConfigIdGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigIdGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ECIObjectKeyData ECIGetInIn) {
    super(id, context, "EmfConfigIdGet");
    ECIGetIn = ECIGetInIn;
  }

  public void translateToMap() {
    if (ECIGetIn != null) {
      ECIGetIn.resetFlags(true, true);
      addInput("EmfConfigId", ECIObjectKeyHelper.toMap(ECIGetIn, new HashMap(), "ECIObjectKeyData").get("ECIObjectKeyData"));
    }
  }


/**
 *
 * Sets the EmfConfigId
 * @param ECIGetInIn Value of the ECIGetIn
 *
 */

  public void setEmfConfigId(ECIObjectKeyData ECIGetInIn) {
    ECIGetIn = ECIGetInIn;
  }

  public void translateFromMap() {
    ECIGetIn = ECIObjectKeyHelper.fromMap(inputMap, "EmfConfigId");
  }

/**
 *
 * Gets the EmfConfigId
 * @return Value of the EmfConfigId
 *
 */

  public ECIObjectKeyData getEmfConfigId( ) {
    return ECIGetIn;
  }

}
