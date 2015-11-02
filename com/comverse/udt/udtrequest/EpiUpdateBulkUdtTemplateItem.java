/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EpiUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EpiUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EpiObjectData EpiUpdateIn;
/**
 *
 * Constructor to create a  EpiUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EpiUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EpiObjectData EpiUpdateInIn) {
    super(id, context, "EpiUpdate");
    EpiUpdateIn = EpiUpdateInIn;
  }

  public void translateToMap() {
    if (EpiUpdateIn != null) {
      EpiUpdateIn.resetFlags(true, true);
      addInput("Epi", EpiObjectHelper.toMap(EpiUpdateIn, new HashMap(), "Epi").get("Epi"));
    }
  }


/**
 *
 * Sets the Epi
 * @param EpiUpdateInIn Value of the EpiUpdateIn
 *
 */

  public void setEpi(EpiObjectData EpiUpdateInIn) {
    EpiUpdateIn = EpiUpdateInIn;
  }

  public void translateFromMap() {
    EpiUpdateIn = EpiObjectHelper.fromMap(inputMap, "Epi");
  }

/**
 *
 * Gets the Epi
 * @return Value of the Epi
 *
 */

  public EpiObjectData getEpi( ) {
    return EpiUpdateIn;
  }

}
