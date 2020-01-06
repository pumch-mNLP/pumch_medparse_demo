#! /usr/bin/env python

# Install the Python Requests library:
# `pip install requests`

import requests
import json


def send_pumch_mnlp_medparse_request(action="parse_str_mr",server_url="127.0.0.1:7710",input_content=""):
    """
    病历解析
    :param action: parse_str_mr
    :param server_url:
    :param input_content:
    :return:
    """

    try:
        response = requests.post(
            url="http://%s/v1/medicalrecord/pumch_medparse/"%server_url,
            headers={
                "Content-Type": "application/json; charset=utf-8",
            },
            data=json.dumps({
                "action": "parse_str_mr",
                "input_content": input_content
            })
        )
        if response.status_code == 200:
            return  json.loads(response.text)
    except requests.exceptions.RequestException:
        return  None


