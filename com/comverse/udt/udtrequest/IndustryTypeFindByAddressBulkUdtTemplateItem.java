/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeFindByAddressBulkUdtTemplateItem.java
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
 * Class used to create a IndustryTypeFindByAddressBulkUdtTemplateItem Bulk Template
 *
 */

public class IndustryTypeFindByAddressBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer address_id;
  protected Integer _language_code;
/**
 *
 * Constructor to create a  IndustryTypeFindByAddressBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public IndustryTypeFindByAddressBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer address_idIn, Integer _language_codeIn) {
    super(id, context, "IndustryTypeFindByAddress");
    address_id = address_idIn;
    _language_code = _language_codeIn;
  }

  public void translateToMap() {
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
    if (_language_code != null) {
      addInput("LanguageCode", _language_code);
    }
  }


/**
 *
 * Sets the AddressId
 * @param address_idIn Value of the address_id
 *
 */

  public void setAddressId(Integer address_idIn) {
    address_id = address_idIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param _language_codeIn Value of the _language_code
 *
 */

  public void setLanguageCode(Integer _language_codeIn) {
    _language_code = _language_codeIn;
  }

  public void translateFromMap() {
    address_id = (Integer)inputMap.get("AddressId");
    _language_code = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return address_id;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return _language_code;
  }

}
