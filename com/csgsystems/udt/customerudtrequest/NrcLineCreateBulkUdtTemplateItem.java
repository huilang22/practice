/*
 * Generated code DO NOT EDIT
 * Generated file: NrcLineCreateBulkUdtTemplateItem.java
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
 * Class used to create a NrcLineCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcLineCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcLineObjectData nlCrIn;
/**
 *
 * Constructor to create a  NrcLineCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcLineCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcLineObjectData nlCrInIn) {
    super(id, context, "NrcLineCreate");
    nlCrIn = nlCrInIn;
  }

  public void translateToMap() {
    if (nlCrIn != null) {
      nlCrIn.resetFlags(true, true);
      addInput("NrcLine", NrcLineObjectHelper.toMap(nlCrIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }


/**
 *
 * Sets the NrcLine
 * @param nlCrInIn Value of the nlCrIn
 *
 */

  public void setNrcLine(NrcLineObjectData nlCrInIn) {
    nlCrIn = nlCrInIn;
  }

  public void translateFromMap() {
    nlCrIn = NrcLineObjectHelper.fromMap(inputMap, "NrcLine");
  }

/**
 *
 * Gets the NrcLine
 * @return Value of the NrcLine
 *
 */

  public NrcLineObjectData getNrcLine( ) {
    return nlCrIn;
  }

}
