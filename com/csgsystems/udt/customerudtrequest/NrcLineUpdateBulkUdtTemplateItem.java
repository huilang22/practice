/*
 * Generated code DO NOT EDIT
 * Generated file: NrcLineUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NrcLineUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcLineUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcLineObjectData nlUpdIn;
/**
 *
 * Constructor to create a  NrcLineUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcLineUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcLineObjectData nlUpdInIn) {
    super(id, context, "NrcLineUpdate");
    nlUpdIn = nlUpdInIn;
  }

  public void translateToMap() {
    if (nlUpdIn != null) {
      nlUpdIn.resetFlags(true, true);
      addInput("NrcLine", NrcLineObjectHelper.toMap(nlUpdIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }


/**
 *
 * Sets the NrcLine
 * @param nlUpdInIn Value of the nlUpdIn
 *
 */

  public void setNrcLine(NrcLineObjectData nlUpdInIn) {
    nlUpdIn = nlUpdInIn;
  }

  public void translateFromMap() {
    nlUpdIn = NrcLineObjectHelper.fromMap(inputMap, "NrcLine");
  }

/**
 *
 * Gets the NrcLine
 * @return Value of the NrcLine
 *
 */

  public NrcLineObjectData getNrcLine( ) {
    return nlUpdIn;
  }

}
