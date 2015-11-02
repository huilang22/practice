/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineUpdateBulkUdtTemplateItem.java
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
