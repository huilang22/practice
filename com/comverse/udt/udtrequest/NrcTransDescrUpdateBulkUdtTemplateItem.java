/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NrcTransDescrUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTransDescrObjectData nrcUpdIn;
/**
 *
 * Constructor to create a  NrcTransDescrUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTransDescrObjectData nrcUpdInIn) {
    super(id, context, "NrcTransDescrUpdate");
    nrcUpdIn = nrcUpdInIn;
  }

  public void translateToMap() {
    if (nrcUpdIn != null) {
      nrcUpdIn.resetFlags(true, true);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrcUpdIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }


/**
 *
 * Sets the NrcTransDescr
 * @param nrcUpdInIn Value of the nrcUpdIn
 *
 */

  public void setNrcTransDescr(NrcTransDescrObjectData nrcUpdInIn) {
    nrcUpdIn = nrcUpdInIn;
  }

  public void translateFromMap() {
    nrcUpdIn = NrcTransDescrObjectHelper.fromMap(inputMap, "NrcTransDescr");
  }

/**
 *
 * Gets the NrcTransDescr
 * @return Value of the NrcTransDescr
 *
 */

  public NrcTransDescrObjectData getNrcTransDescr( ) {
    return nrcUpdIn;
  }

}
