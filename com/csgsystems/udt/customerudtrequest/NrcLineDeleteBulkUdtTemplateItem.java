/*
 * Generated code DO NOT EDIT
 * Generated file: NrcLineDeleteBulkUdtTemplateItem.java
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
 * Class used to create a NrcLineDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcLineDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcLineObjectKeyData nlDeleteIn;
/**
 *
 * Constructor to create a  NrcLineDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcLineDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcLineObjectKeyData nlDeleteInIn) {
    super(id, context, "NrcLineDelete");
    nlDeleteIn = nlDeleteInIn;
  }

  public void translateToMap() {
    if (nlDeleteIn != null) {
      nlDeleteIn.resetFlags(true, true);
      addInput("NrcLine", NrcLineObjectKeyHelper.toMap(nlDeleteIn, new HashMap(), "NrcLineObjectKeyData").get("NrcLineObjectKeyData"));
    }
  }


/**
 *
 * Sets the NrcLine
 * @param nlDeleteInIn Value of the nlDeleteIn
 *
 */

  public void setNrcLine(NrcLineObjectKeyData nlDeleteInIn) {
    nlDeleteIn = nlDeleteInIn;
  }

  public void translateFromMap() {
    nlDeleteIn = NrcLineObjectKeyHelper.fromMap(inputMap, "NrcLine");
  }

/**
 *
 * Gets the NrcLine
 * @return Value of the NrcLine
 *
 */

  public NrcLineObjectKeyData getNrcLine( ) {
    return nlDeleteIn;
  }

}
