/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrCreateBulkUdtTemplateItem.java
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
 * Class used to create a NrcTransDescrCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTransDescrObjectData nrcCrIn;
/**
 *
 * Constructor to create a  NrcTransDescrCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectData nrcCrInIn) {
    super(id, context, "NrcTransDescrCreate");
    nrcCrIn = nrcCrInIn;
  }

  public void translateToMap() {
    if (nrcCrIn != null) {
      nrcCrIn.resetFlags(true, true);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrcCrIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }


/**
 *
 * Sets the NrcTransDescr
 * @param nrcCrInIn Value of the nrcCrIn
 *
 */

  public void setNrcTransDescr(NrcTransDescrObjectData nrcCrInIn) {
    nrcCrIn = nrcCrInIn;
  }

  public void translateFromMap() {
    nrcCrIn = NrcTransDescrObjectHelper.fromMap(inputMap, "NrcTransDescr");
  }

/**
 *
 * Gets the NrcTransDescr
 * @return Value of the NrcTransDescr
 *
 */

  public NrcTransDescrObjectData getNrcTransDescr( ) {
    return nrcCrIn;
  }

}
