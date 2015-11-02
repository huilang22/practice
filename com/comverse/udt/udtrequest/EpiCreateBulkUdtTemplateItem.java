/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiCreateBulkUdtTemplateItem.java
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
 * Class used to create a EpiCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiObjectData EpiCreateIn;
/**
 *
 * Constructor to create a  EpiCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectData EpiCreateInIn) {
    super(id, context, "EpiCreate");
    EpiCreateIn = EpiCreateInIn;
  }

  public void translateToMap() {
    if (EpiCreateIn != null) {
      EpiCreateIn.resetFlags(true, true);
      addInput("Epi", EpiObjectHelper.toMap(EpiCreateIn, new HashMap(), "Epi").get("Epi"));
    }
  }


/**
 *
 * Sets the Epi
 * @param EpiCreateInIn Value of the EpiCreateIn
 *
 */

  public void setEpi(EpiObjectData EpiCreateInIn) {
    EpiCreateIn = EpiCreateInIn;
  }

  public void translateFromMap() {
    EpiCreateIn = EpiObjectHelper.fromMap(inputMap, "Epi");
  }

/**
 *
 * Gets the Epi
 * @return Value of the Epi
 *
 */

  public EpiObjectData getEpi( ) {
    return EpiCreateIn;
  }

}
