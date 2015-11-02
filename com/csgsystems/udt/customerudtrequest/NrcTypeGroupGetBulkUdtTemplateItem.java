/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTypeGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a NrcTypeGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTypeGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTypeGroupObjectKeyData NTGGetIn;
/**
 *
 * Constructor to create a  NrcTypeGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTypeGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTypeGroupObjectKeyData NTGGetInIn) {
    super(id, context, "NrcTypeGroupGet");
    NTGGetIn = NTGGetInIn;
  }

  public void translateToMap() {
    if (NTGGetIn != null) {
      NTGGetIn.resetFlags(true, true);
      addInput("NrcTypeGroup", NrcTypeGroupObjectKeyHelper.toMap(NTGGetIn, new HashMap(), "NrcTypeGroupObjectKeyData").get("NrcTypeGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the NrcTypeGroup
 * @param NTGGetInIn Value of the NTGGetIn
 *
 */

  public void setNrcTypeGroup(NrcTypeGroupObjectKeyData NTGGetInIn) {
    NTGGetIn = NTGGetInIn;
  }

  public void translateFromMap() {
    NTGGetIn = NrcTypeGroupObjectKeyHelper.fromMap(inputMap, "NrcTypeGroup");
  }

/**
 *
 * Gets the NrcTypeGroup
 * @return Value of the NrcTypeGroup
 *
 */

  public NrcTypeGroupObjectKeyData getNrcTypeGroup( ) {
    return NTGGetIn;
  }

}
