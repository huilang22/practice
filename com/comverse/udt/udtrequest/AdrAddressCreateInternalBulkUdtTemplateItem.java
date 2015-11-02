/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressCreateInternalBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a AdrAddressCreateInternalBulkUdtTemplateItem Bulk Template
 *
 */

public class AdrAddressCreateInternalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected LocalAddressObjectData LocalAddressCreateInternalIn;
/**
 *
 * Constructor to create a  AdrAddressCreateInternalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AdrAddressCreateInternalBulkUdtTemplateItem(String id, BSDMSessionContext context, LocalAddressObjectData LocalAddressCreateInternalInIn) {
    super(id, context, "AdrAddressCreateInternal");
    LocalAddressCreateInternalIn = LocalAddressCreateInternalInIn;
  }

  public void translateToMap() {
    if (LocalAddressCreateInternalIn != null) {
      LocalAddressCreateInternalIn.resetFlags(true, true);
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressCreateInternalIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }


/**
 *
 * Sets the AdrAddress
 * @param LocalAddressCreateInternalInIn Value of the LocalAddressCreateInternalIn
 *
 */

  public void setAdrAddress(LocalAddressObjectData LocalAddressCreateInternalInIn) {
    LocalAddressCreateInternalIn = LocalAddressCreateInternalInIn;
  }

  public void translateFromMap() {
    LocalAddressCreateInternalIn = LocalAddressObjectHelper.fromMap(inputMap, "AdrAddress");
  }

/**
 *
 * Gets the AdrAddress
 * @return Value of the AdrAddress
 *
 */

  public LocalAddressObjectData getAdrAddress( ) {
    return LocalAddressCreateInternalIn;
  }

}
